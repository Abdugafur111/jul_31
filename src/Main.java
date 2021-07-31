public class Main {

    public static void main(String[] args) {
	Course course1 = new Course("English");

	course1.addStudent("Kelly");
	course1.addStudent("Berry");
	course1.addStudent("Lola");

        System.out.println(course1.getCourseName());
        System.out.println("Number Of Students: " + course1.getNumberOfStudents());
        String[] students  = course1.getStudents();
        for(int i=0; i< course1.getNumberOfStudents();i++){
            System.out.print(students[i] + ", ");
        }



        }
    }

