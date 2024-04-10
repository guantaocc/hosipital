package com.example.hosipital.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.util.UUID;

@RestController
public class FileUploadController {

    private final String uploadDir = "D:/upload";
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
// 检查文件类型和大小
        String contentType = file.getContentType();
        if (!contentType.equals("image/jpeg") && !contentType.equals("image/png")) {
            return "仅支持jpeg和png图片";
        }
        // 此处检测大小，单位mb，getSize为字节
        if (file.getSize() > 1048576 * 100) { // 1MB
            return "文件大小不能超过100MB";
        }

        // 生成随机文件名
        String newFileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        String filePath = uploadDir + File.separator + newFileName;

        // 创建文件存储目录
        File newFile = new File(filePath);
        if (!newFile.getParentFile().exists()) {
            newFile.getParentFile().mkdirs();
        }

        // 将文件保存到指定路径
        file.transferTo(newFile);

        return filePath; // 返回文件路径
    }
}
