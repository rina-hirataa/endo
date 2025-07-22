package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.repository.NuserRepository;
import com.example.demo.service.Password_Hasher;

@Controller
public class AddController {

    @Autowired
    private NuserRepository nuserRepository;

    // アカウント登録フォームを表示するメソッド
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        return "registration"; // registration.html の Thymeleaf テンプレートを返す
    }

    // アカウント登録処理
    @PostMapping("/register")
    public String registerUser(@RequestParam String employeeId, @RequestParam String name,
                               @RequestParam String email, @RequestParam String password,
                               @RequestParam int departmentId, @RequestParam int role,
                               Model model) {
        
        // パスワードをハッシュ化（SHA-256など）する処理
        String hashedPassword = Password_Hasher.hashPassword(password);

        // ユーザーオブジェクトを作成
        User newUser = new User();
        newUser.setEmployeeId(employeeId);
        newUser.setName(name);
        newUser.setEmail(email);
        newUser.setPassword(hashedPassword);
        newUser.setDepartmentId(departmentId);
        newUser.setRole(role);

        // ユーザーをデータベースに保存
        nuserRepository.save(newUser);

        // 登録完了メッセージなどを表示
        model.addAttribute("successMessage", "アカウントが登録されました。");

        return "registration"; // 再度登録画面を表示（必要に応じてリダイレクトも可）
    }
}

