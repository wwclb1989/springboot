package com.itheima.itcastchapter09;

import com.itheima.itcastchapter09.service.SendEmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootTest
class ItcastChapter09ApplicationTests {

    @Autowired
    private SendEmailService sendEmailService;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void sendSimpleMailTest() {
        String to = "76217148@qq.com";
        String subject = "【纯文本文件】标题";
        String text = "Spring Boot 纯文本邮件发送内容测试......";

        // 发送纯文本邮件
        sendEmailService.sendSimpleEmail(to, subject, text);
    }

    @Test
    public void sendComplexEmailTest() {
        String to = "76217148@qq.com";
        String subject = "【复杂邮件】标题";
        // 定义邮件内容
        StringBuilder text = new StringBuilder();
        text.append("<html><head></head>");
        text.append("<body><h1>祝大家元旦快乐！</h1>");

        String rscId = "img001";
        text.append("<img src='cid:" + rscId + "'/></body>");
        text.append("</html>");

        // 指定静态资源文件和附件路径
        String rscPath = "F:\\newyear.jpg";
        String filePath = "F:\\元旦放假注意事项.txt";

        // 发送复杂邮件
        sendEmailService.sendComplexEmail(to, subject, text.toString(), filePath, rscId, rscPath);

    }

    @Test
    public void sendTemplateEmailTest() {
        String to = "76217148@qq.com";
        String subject = "【模板邮件】标题";
        // 使用模板邮件定制邮件正文内容
        Context context = new Context();
        context.setVariable("username", "石头");
        context.setVariable("code", "456123");
        // 使用TemplateEngine设置要处理的模板页面
        String emailContent = templateEngine.process("emailTemplate_vercode", context);
        // 发送模板邮件
        sendEmailService.sendTemplateEmail(to, subject, emailContent);
    }

}
