/**
 * Clase principal que gestiona la creación y manejo de eventos sostenibles,
 * usuarios, organizadores e inscripciones.
 */
public class EventosSostenibles {

    /**
     * Agrega un nuevo evento al array de eventos en la posición especificada por el índice.
     *
     * @param eventos    El array bidimensional donde se almacenan los eventos.
     * @param index      La posición en el array donde se almacenará el evento.
     * @param nombre     El nombre del evento.
     * @param fecha      La fecha del evento.
     * @param duracion   La duración del evento.
     * @param ubicacion  La ubicación del evento.
     * @param categoria  La categoría del evento.
     * @return El array de eventos actualizado, o null si el array no ha sido inicializado.
     */
    public static String[][] agregarEvento(String[][] eventos, int index, String nombre, String fecha, String duracion, String ubicacion, String categoria) {
        if (eventos == null) {
            System.out.println("Error: El array de eventos no ha sido inicializado.");
            return null;
        }
        eventos[index][0] = nombre;
        eventos[index][1] = fecha;
        eventos[index][2] = duracion;
        eventos[index][3] = ubicacion;
        eventos[index][4] = categoria;
        return eventos;
    }

    /**
     * Agrega un nuevo usuario al array de usuarios en la posición especificada por el índice.
     *
     * @param usuarios    El array bidimensional donde se almacenan los usuarios.
     * @param index       La posición en el array donde se almacenará el usuario.
     * @param nombre      El nombre del usuario.
     * @param correo      El correo electrónico del usuario.
     * @param contrasena  La contraseña del usuario.
     * @return El array de usuarios actualizado, o null si el array no ha sido inicializado.
     */
    public static String[][] agregarUsuario(String[][] usuarios, int index, String nombre, String correo, String contrasena) {
        if (usuarios == null) {
            System.out.println("Error: El array de usuarios no ha sido inicializado.");
            return null;
        }
        usuarios[index][0] = nombre;
        usuarios[index][1] = correo;
        usuarios[index][2] = contrasena;
        return usuarios;
    }

    /**
     * Agrega un nuevo organizador al array de organizadores en la posición especificada por el índice.
     *
     * @param organizadores El array bidimensional donde se almacenan los organizadores.
     * @param index         La posición en el array donde se almacenará el organizador.
     * @param nombre        El nombre del organizador.
     * @param contacto      La información de contacto del organizador.
     * @return El array de organizadores actualizado, o null si el array no ha sido inicializado.
     */
    public static String[][] agregarOrganizador(String[][] organizadores, int index, String nombre, String contacto) {
        if (organizadores == null) {
            System.out.println("Error: El array de organizadores no ha sido inicializado.");
            return null;
        }
        organizadores[index][0] = nombre;
        organizadores[index][1] = contacto;
        return organizadores;
    }

    /**
     * Inscribe un usuario en un evento y agrega la inscripción al array de inscripciones en la posición especificada por el índice.
     *
     * @param inscripciones El array bidimensional donde se almacenan las inscripciones.
     * @param index         La posición en el array donde se almacenará la inscripción.
     * @param usuario       El nombre del usuario que se inscribe.
     * @param evento        El nombre del evento al que se inscribe el usuario.
     * @return El array de inscripciones actualizado, o null si el array no ha sido inicializado.
     */
    public static String[][] inscribirUsuario(String[][] inscripciones, int index, String usuario, String evento) {
        if (inscripciones == null) {
            System.out.println("Error: El array de inscripciones no ha sido inicializado.");
            return null;
        }
        inscripciones[index][0] = usuario;
        inscripciones[index][1] = evento;
        return inscripciones;
    }

    /**
     * Lista todos los eventos almacenados en el array de eventos.
     *
     * @param eventos El array bidimensional que contiene los eventos.
     */
    public static void listarEventos(String[][] eventos) {
        System.out.println("Listado de Eventos:");
        if (eventos == null) {
            System.out.println("No hay eventos registrados.");
            return;
        }
        for (String[] evento : eventos) {
            if (evento != null && evento[0] != null) {
                System.out.println("Nombre: " + evento[0] + ", Fecha: " + evento[1] + ", Duración: " + evento[2] + ", Ubicación: " + evento[3] + ", Categoría: " + evento[4]);
            }
        }
    }

    /**
     * Lista todos los usuarios almacenados en el array de usuarios.
     *
     * @param usuarios El array bidimensional que contiene los usuarios.
     */
    public static void listarUsuarios(String[][] usuarios) {
        System.out.println("Listado de Usuarios:");
        if (usuarios == null) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        for (String[] usuario : usuarios) {
            if (usuario != null && usuario[0] != null) {
                System.out.println("Nombre: " + usuario[0] + ", Correo: " + usuario[1]);
            }
        }
    }

    /**
     * Lista todas las inscripciones almacenadas en el array de inscripciones.
     *
     * @param inscripciones El array bidimensional que contiene las inscripciones.
     */
    public static void listarInscripciones(String[][] inscripciones) {
        System.out.println("Listado de Inscripciones:");
        if (inscripciones == null) {
            System.out.println("No hay inscripciones registradas.");
            return;
        }
        for (String[] inscripcion : inscripciones) {
            if (inscripcion != null && inscripcion[0] != null) {
                System.out.println("Usuario: " + inscripcion[0] + ", Evento: " + inscripcion[1]);
            }
        }
    }

    /**
     * Método principal que ejecuta la aplicación.
     * 
     * 1. Inicializa los arrays para eventos, usuarios, organizadores e inscripciones.
     * 2. Agrega eventos, usuarios y organizadores.
     * 3. Inscribe usuarios en eventos.
     * 4. Lista los eventos, usuarios e inscripciones para verificar que todo funciona correctamente.
     *
     * @param args
     */

    public static void main(String[] args) {
        // Arrays para almacenar la información (inicialmente null)
        String[][] eventos = new String[10][5]; 
        String[][] usuarios = new String[10][5]; 
        String[][] organizadores = new String[10][2]; 
        String[][] inscripciones = new String[10][2];

        // Agregamos algunos eventos
        eventos = agregarEvento(eventos, 0, "Conferencia sobre Cambio Climático", "2023-11-15", "2 horas", "Online", "Conferencia");
        eventos = agregarEvento(eventos, 1, "Taller de Reciclaje", "2023-11-20", "3 horas", "Madrid", "Taller");

        // Intentamos agregar un usuario sin inicializar el array (debería mostrar un error)
        usuarios = agregarUsuario(usuarios, 0, "Juan Pérez", "juan@example.com", "password123");

        // Agregamos algunos organizadores
        organizadores = agregarOrganizador(organizadores, 0, "EcoOrg", "contacto@ecoorganizacion.com");
        organizadores = agregarOrganizador(organizadores, 1, "GreenTeam", "info@greenteam.org");

        // Inscribimos usuarios en eventos
        inscripciones = inscribirUsuario(inscripciones, 0, "Juan Pérez", "Conferencia sobre Cambio Climático");
        inscripciones = inscribirUsuario(inscripciones, 1, "Ana Gómez", "Taller de Reciclaje");

        // Listamos los eventos, usuarios e inscripciones para verificar que todo funciona
        listarEventos(eventos);
        System.out.println();
        listarUsuarios(usuarios);
        System.out.println();
        listarInscripciones(inscripciones);
    }
}