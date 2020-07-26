//package sample.demo;
//
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.control.Button;
//
//import java.util.ArrayList;
//
//class Student {
//    public String firstName;
//    public String lastName;
//}
//
//interface GetSortProperty {
//    String get(Student student);
//}
//
//
//public class HighOrderFunction2 <T> {
//
//    static void sort(ArrayList<Student> input, GetSortProperty xyz) {
//
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<>();
//
//        HighOrderFunction2::sort(students, std -> std.name);
//
//        HighOrderFunction2::sort(students, std -> std.grade);
//    }
//
////    public static void main(String[] args) {
////
////        Button btn = new Button("click");
////
////        btn.setOnAction(HighOrderFunction2::handle);    // calling static function
////
////    }
////
////    public static void handle(ActionEvent actionEvent) {
////
////    }
//}
