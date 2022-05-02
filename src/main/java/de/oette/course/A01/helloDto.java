package de.oette.course.A01;

public class helloDto {
    public static class HelloDto  {
        private String text; 

        public HelloDto(String text) {
            this.text = text;
        }

        public String getText(){
            return text;
        }
    }
}
