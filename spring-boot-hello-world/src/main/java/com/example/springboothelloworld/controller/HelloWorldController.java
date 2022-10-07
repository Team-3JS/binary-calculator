package com.example.springboothelloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.common.primitives.Bytes;
import org.apache.commons.text.WordUtils;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "Hello World";
    }

    @GetMapping("/guava-example")
    public String guavaExample(){
        byte[] myArray = {1, 2, 3};
        Bytes.reverse(myArray);
        String result = "";
        for (int i=0; i<3; i++){
            result = result + myArray[i] + " ";
        }

        return result;
    }

    @GetMapping("/commons-example")
    public String commonsExample() {
        String toBeCapitalized = "cal poly pomona";
        String capitalizedResult = WordUtils.capitalize(toBeCapitalized);
        return toBeCapitalized + " capitalized into " + capitalizedResult;

    }

}
