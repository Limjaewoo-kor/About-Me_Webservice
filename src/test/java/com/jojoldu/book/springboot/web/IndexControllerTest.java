package com.jojoldu.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IndexControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void 메인페이지_로딩() {
        //when
        String body = this.restTemplate.getForObject("/",String.class);
        //then
        assertThat(body).contains("로그인");
    }

    @Test
    public void who페이지_로딩() {
        //when
        String body = this.restTemplate.getForObject("/who",String.class);
        //then
        assertThat(body).contains("Lim Jae Woo 는?");
    }
    @Test
    public void project페이지_로딩() {
        //when
        String body = this.restTemplate.getForObject("/project",String.class);
        //then
        assertThat(body).contains("주차장 금액 정산 프로젝트는");
    }
    @Test
    public void project2페이지_로딩() {
        //when
        String body = this.restTemplate.getForObject("/project2",String.class);
        //then
        assertThat(body).contains("숨은 카페 찾기 프로젝트는");
    }
    @Test
    public void project3페이지_로딩() {
        //when
        String body = this.restTemplate.getForObject("/project3",String.class);
        //then
        assertThat(body).contains("자기 소개 프로젝트는");
    }
    @Test
    public void board페이지_로딩() {
        //when
        String body = this.restTemplate.getForObject("/board",String.class);
        //then
        assertThat(body).contains("글 등록");
    }
}
