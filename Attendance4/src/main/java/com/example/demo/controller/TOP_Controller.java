   
    
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
   // @RequiredArgsConstructor
    public class TOP_Controller {
    	
    	//いるかわからん↑g
    	//private final ColorService service;
    
    	
    	// ColorRepositoryはcolorテーブルにアクセスするためのリポジトリ
    	/*--- 最初のリクエスト -------------------------*/
    	@GetMapping("/TOP")
    	 public String TOP() {
            return "TOP"; // input.htmlを返す
        }
    	 @GetMapping("/AtAdd")
    	    public String AtAdd() {
    	        return "AtAdd"; // Thymeleafは templates/AtAdd.html を探します
    	 }
    	 @GetMapping("/L")
    	    public String L() {
    	        return "L"; // Thymeleafは templates/AtAdd.html を探します
    	    }
    	 
    	 @GetMapping("/System")
 	    public String System() {
 	        return "System"; // Thymeleafは templates/AtAdd.html を探します
 	    }
    	// @PostMapping("/System")
     	//public String System(@RequestParam String colorSearch, Model model) {
     	   /* List<Color> filteredColors = colorRepository.findByColorNameOrColorCode(colorSearch);
         model.addAttribute("colors", filteredColors);*/
     	//    return "System";
     	//}
    	 
    	 @GetMapping("/AtMenu")
 	    public String AtMenu() {
 	        return "AtMenu"; // Thymeleafは templates/AtAdd.html を探します
 	    }
    	 @GetMapping("/Attendance_edit")
  	    public String Attendance_edit() {
  	        return "Attendance_edit"; // Thymeleafは templates/AtAdd.html を探します
  	    }
    	 @GetMapping("/Attendance_register")
   	    public String Attendance_register() {
   	        return "Attendance_register"; // Thymeleafは templates/AtAdd.html を探します
   	    }
    	 @GetMapping("/Attendance_search")
   	    public String Attendance_search() {
   	        return "Attendance_search"; // Thymeleafは templates/AtAdd.html を探します
   	    }
    	 @GetMapping("/Admin")
   	    public String Admin() {
   	        return "Admin"; // Thymeleafは templates/AtAdd.html を探します
   	    }
    	 
    	 @PostMapping("/Register_complate")
    	 public String registerAttendance(
    	     @RequestParam String dateInput,
    	     @RequestParam String startTime,
    	     @RequestParam String endTime,
    	     @RequestParam String breakTime,
    	     @RequestParam String workTime,
    	     @RequestParam String attendanceType,
    	     Model model) {
    	     // 受け取ったデータを処理する
    	     // 例: model.addAttribute("date", dateInput);
    	     return "Register_complate"; // 登録完了画面を表示
    	 }
    	
    	 
    }
    	

    