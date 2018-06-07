package com.syl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 接收和处理用户请求的地方
 * 处理器
 */
/*@Controller*/
public class HelloController extends AbstractController {

    /*@RequestMapping("/hello")
    public String hello(){
        System.out.println("进入了hello");
        return "/WEB-INF/index.jsp";
    }*/
    /**
     * 只要有人访问我们这个HelloController！这个方法是默认执行的！
     * 类似于我们Struts2的execute()
     *
     * @return ModelAndView
     *
     * ModelAndView 由  Model  和  View 组成
     * Model底层其实是一个Map集合！ 用来保存我们前后台传输的数据
     * View虽然在底层代码中是一个Object类型，其实就是一个String类型的视图地址！
     *
     * 创建ModelAndView对象的时候，其实有6个构造但是可以理解成3种方式
     * 01.只传递视图名称
     * 02.传递视图名称的同时传递model
     * 03.传递视图名称的同时传递model，只不过把model拆分成key和value
     */
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("进入了我们第一个SpringMvc");
        return new ModelAndView("hello");//逻辑视图名称
    }

}
