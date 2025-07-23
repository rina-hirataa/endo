package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.AttendanceEntity;
import com.example.demo.form.AttendancetForm;
import com.example.demo.service.RegistService;

@Controller
public class RegisterController {

	@Autowired
	private RegistService service;

    @ModelAttribute("AttendancetForm")
    public AttendancetForm form() {
        return new AttendancetForm();
    }

    @PostMapping("/Register_complate")
    public String registerComplate(
    		@Validated @ModelAttribute AttendancetForm form,
            BindingResult result) {
    	
    	
    	
        if (result.hasErrors()) {
        	System.out.println("error");
            return "Register_complate"; // HTMLのテンプレート名
       }

        AttendanceEntity e = new AttendanceEntity();
        e.setEmpId(form.getEmpId());
        e.setWorkDate(form.getWorkDate());
        e.setLeaveType(form.getLeaveType());
        e.setCheckInTime(form.getCheckInTime());
        e.setCheckOutTime(form.getCheckOutTime());
        e.setBreakTime(form.getBreakTime());
        e.setOvertimeHours(form.getOvertimeHours());
        e.setConsecutiveDays(form.getConsecutiveDays());
        e.setWorkTimeHours(form.getWorkTimeHours());
        e.setRemarks(form.getRemarks());
        e.setApproval(form.getApproval());
        e.setUpdatedAt(form.getUpdatedAt());

        service.regist(e);
        return "Register_complate";
    }
    
    @GetMapping("/Attendance_register")
    public String showRegisterForm(Model model) {
        model.addAttribute("AttendancetForm", new AttendancetForm()); // 必須！
        return "Attendance_register"; // HTML名
    }
}
