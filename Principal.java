public class Principal {
    public static void main(String args[]) {
    Trabalhador severino = new Trabalhador("sapato", 200); 
    Trabalhador raimundo = new Trabalhador("bota", 400);
    Trabalhador frederico = new Trabalhador("chinelo", 600);
    frederico.start();
    severino.start();
    raimundo.start();
    } }