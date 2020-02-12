package com.itheima.itcastchapter08;

import com.itheima.itcastchapter08.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItcastChapter08ApplicationTests {

    @Autowired
    private AmqpAdmin amqpAdmin;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void amqpAdmin() {
        // 1. 定义fanout类型的交换器
        amqpAdmin.declareExchange(new FanoutExchange("fanout_cxchange"));
        // 2. 定义两个默认持久化队列，分别处理email和sms
        amqpAdmin.declareQueue(new Queue("fanout_queue_email"));
        amqpAdmin.declareQueue(new Queue("fanout_queue_sms"));
        // 3. 将队列分别与交换器进行绑定
        amqpAdmin.declareBinding(new Binding("fanout_queue_email", Binding.DestinationType.QUEUE, "fanout_exchange", "", null));
        amqpAdmin.declareBinding(new Binding("fanout_queue_sms", Binding.DestinationType.QUEUE, "fanout_exchange", "", null));
    }

    @Test
    public void psubPublisher() {
        User user = new User();
        user.setId(1);
        user.setUsername("石头");

        rabbitTemplate.convertAndSend("fanout_exchange", "", user);
    }

    // 2. Routing工作模式消息发送器
    @Test
    public void routingPuslisher() {
        rabbitTemplate.convertAndSend("routing_exchange", "error_routing_key", "routing send error message");
    }

    // 3. Topics工作模式消息发送端
    @Test
    public void topicPuslisher() {
        // (1) 只发送邮件订阅用户消息
        rabbitTemplate.convertAndSend("topic_exchange", "info.email", "topic send email message");

        // (2) 只发送短信订阅用户消息
//        rabbitTemplate.convertAndSend("topic_exchange", "info.sms", "topics send sms message");
        
        // (3) 发送同时订阅邮件和短信的用户消息
//        rabbitTemplate.convertAndSend("topic_exchange", "info.email.sms", "topics send email and sms message");
    }
}
