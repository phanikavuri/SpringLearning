package com.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class TestAppAnnotation {
   public static void main(String[] args) {
      ApplicationContext ctx = 
         new AnnotationConfigApplicationContext(TextEditorConfig.class);

      TextEditor te = ctx.getBean(TextEditor.class);
      te.spellCheck();
   }
}