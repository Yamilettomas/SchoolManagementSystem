<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        // Crear instancias de estudiantes y cursos
        Estudiante est1 = new Estudiante(1, "Juan", "Perez", "2000-01-01", "matriculado");
        Estudiante est2 = new Estudiante(2, "Ana", "Gomez", "2001-02-02", "matriculado");

        Curso curso1 = new Curso(101, "Matemáticas", "Curso de matemáticas básicas", 5, "1.0");
        Curso curso2 = new Curso(102, "Historia", "Curso de historia universal", 4, "1.0");

        // Instanciar GestorAcademico
        GestorAcademico gestor = new GestorAcademico();

        // Probar métodos
        gestor.matricularEstudiante(est1);
        gestor.matricularEstudiante(est2);

        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);

        try {
            gestor.inscribirEstudianteCurso(est1, 101);
            gestor.inscribirEstudianteCurso(est2, 102);
        } catch (EstudianteYaInscritoException e) {
            e.printStackTrace();
        }

        try {
            gestor.desinscribirEstudianteCurso(1, 101);
        } catch (EstudianteNoInscritoEnCursoException e) {
            e.printStackTrace();
        }

        // Verificar que los métodos funcionan según las especificaciones
    }
}
=======
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
>>>>>>> 99bd5cd52bb0c429aaa0aad43e991b2f9441c254
