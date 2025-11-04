package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/welcome")
    public String welcome(){
        return"Welcome To the Program";
    }

    @GetMapping("/sum")
    public String sum(){
        int result=10+20;
        return "The sum of two 10 and 20 is:"+result;
    }

    @GetMapping("/even")
    public String even(){
        if(4%2==0){
            return "The number 4 is even";
        }else{
            return "The number 4 is odd";
        }
    }
    @GetMapping("/city")
    public String[] city(){
        String[] citys={"riyadh","khobar","jeddah"};
        return citys;
    }

    @GetMapping("/reserved")
    public String reservedName(){
        String names="leena";
        StringBuilder res =new StringBuilder(names);
        String ress= res.reverse().toString();
        return "The name Leena Reserved is:"+ress;
    }

    @GetMapping("/factorial")
    public int factorila(){
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

    @GetMapping("/ages")
    public int[] ages(){
        int[] ages={22,34,55,19};
        return ages;
    }


    @GetMapping("/max")
    public String max(){
        int n1=3;
        int n2=5;
        int n3=8;
        int max=0;
        if(n1>n2 && n1>n3){
            max=n1;
            return "max between 3,5,8 is"+max;
        } else if(n2>n1 && n2>n3){
            max=n2;
            return "max between 3,5,8 is"+max;
        }else{
            max=n3;
            return "max between 3,5,8 is"+max;
        }
    }

    @GetMapping("/phone")
    public String phone(){
        String phone="0856373783";
        return "My Phone number is"+phone;
    }
    @GetMapping("/end")
    public String end(){
        return "This is the end of Program !";
    }
}
