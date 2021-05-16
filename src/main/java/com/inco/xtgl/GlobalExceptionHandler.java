package com.inco.xtgl;

import com.inco.pub.entity.ResultT;
import com.inco.pub.entity.StatusEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {




    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    public ResultT exceptionHandler(HttpServletRequest req, NullPointerException e){

        return ResultT.error(StatusEnum.INTERNAL_SERVER_ERROR,null);
    }


    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    public ResultT exceptionHandler(HttpServletRequest req, Exception e){

        return ResultT.error(StatusEnum.OTHER_ERROR,null);
    }

}
