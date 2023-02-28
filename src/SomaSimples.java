public class SomaSimples {
    public double somar(int num1, int num2) {
        return num1 + num2;
    }

    public void imprimir(String texto) {
        System.out.print(texto);
        // LOGICA - finalidade do metodo
        // não precisa do return
    }
    private void metodoPrivado() {}
    // método privado não será exibido em outras classes

    public void validar() {
        //este método deveria retornar algum valor
        // no caso boolean (true ou false)
    }
}
