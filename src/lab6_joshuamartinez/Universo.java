package lab6_joshuamartinez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Universo {
    private String Nombre;
    private ArrayList<SeresVivos> Seres = new ArrayList();
    private File archivo = null;

    public Universo() {
    }

    public Universo(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    public ArrayList<SeresVivos> getSeres() {
        return Seres;
    }

    public void setSeres(ArrayList<SeresVivos> Seres) {
        this.Seres = Seres;
    }
    
    
    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (SeresVivos t : Seres) {
                bw.write(t.getNombre()+"|");
                bw.write(t.getPoder()+"|");
                bw.write(t.getAño()+ "|");
                bw.write(t.getPlaneta()+ "|");
                bw.write(t.getRaza()+ "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        Seres = new ArrayList();
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    Seres.add(new SeresVivos(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();  
    }
}
