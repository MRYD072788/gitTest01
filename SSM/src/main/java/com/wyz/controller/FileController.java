package com.wyz.controller;

import com.wyz.utils.UploadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author :wyz
 * @description:
 * @create :2022/12/29
 */

//@RestController//@RestController注解包含了@ResponseBody,所以返回的是json数据，不走视图解析器
    @Controller
@RequestMapping("/file")

//代码是可以运行的，且图片也已经上传到服务器成功(在部署的Tomcat里的SSM项目的file目录。不知道为什么idea里的file看不到)
public class FileController {

    @RequestMapping("/upload")
    public String upload(String pdesc, MultipartFile upload, HttpServletRequest request, ModelAndView mav) {
        System.out.println("文件的描述是：" + pdesc);


        //获取存放文件的目录路径
        //返回的是tomcat中webapps目录下的工程路径,重启tomcat(或重新部署项目)则图片文件会消失
        //String realPath = request.getSession().getServletContext().getRealPath("/file" );
        String realPath = "E:\\upLoadImage";
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }

        //将客户端上传的文件，写入到file文件中
        String filename = upload.getOriginalFilename();
        String newName = UploadUtils.getUUIDName(filename);
        System.out.println("newName:"+newName);
        request.setAttribute("newName",newName);
        try {
            upload.transferTo(new File(file, newName));
        } catch (IOException e) {
            e.printStackTrace();

        }




        return "success";
    }
}
