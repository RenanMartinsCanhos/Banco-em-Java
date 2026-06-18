import pendenciasPagar.PendenciaPagamento;
import contaBancaria.ContaCpf;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PendenciaPagamento pag = new PendenciaPagamento();
    ContaCpf cpf = new ContaCpf();
    pag.gerarPendencia(cpf,pag);



}
