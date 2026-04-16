public class PessoaMain {
    public static void main(String[] args) {

        System.out.println("================ TESTE FORNECEDOR ================");
        Fornecedor f = new Fornecedor("Alberto", "rua 1 ap 1",
                "999995555", 2000, 1500);

        System.out.printf("""
                nome: %s
                endereco: %s
                telefone: %s
                valorCredito: %.2f
                valorDivida: %.2f
                salario: %.2f
                """, f.getNome(), f.getEndereco(), f.getTelefone(),
                f.getValorCredito(), f.getValorDivida(), f.getSalario());

        System.out.println("================ TESTE EMPREGADO ================");
        Empregado e = new Empregado("Roberto", "rua 2 ap 2", "666667777",
                1234 , 1000, 0.1);

        System.out.printf("""
                nome: %s
                endereco: %s
                telefone: %s
                codigoSetor: %d
                salarioBase: %.2f
                imposto: %.2f
                salario: %.2f
                """, e.getNome(), e.getEndereco(), e.getTelefone(),
                e.getCodigoSetor(), e.getSalarioBase(), e.getImposto(), e.calcularSalario());

        System.out.println("================ TESTE ADMINISTRADOR ================");
        Administrador a = new Administrador("Roberto", "rua 2 ap 2", "666667777",
                1234 , 1000, 0.1, 50);

        System.out.printf("""
                nome: %s
                endereco: %s
                telefone: %s
                codigoSetor: %d
                salarioBase: %.2f
                imposto: %.2f
                ajudaDeCusto: %.2f
                salario: %.2f
                """, a.getNome(), a.getEndereco(), a.getTelefone(), a.getCodigoSetor(),
                a.getSalarioBase(), a.getImposto(), a.getAjudaDeCusto(), a.calcularSalario());

        System.out.println("================ TESTE OPERARIO ================");
        Operario o = new Operario("Roberto", "rua 2 ap 2", "666667777",
                1234 , 1000, 0.1, 5000, 0.5);

        System.out.printf("""
                nome: %s
                endereco: %s
                telefone: %s
                codigoSetor: %d
                salarioBase: %.2f
                imposto: %.2f
                valorProducao: %.2f
                comissao: %.2f
                salario: %.2f
                """, o.getNome(), o.getEndereco(), o.getTelefone(), o.getCodigoSetor(),
                o.getSalarioBase(), o.getImposto(), o.getValorProducao(), o.getComissao(), o.calcularSalario());

        System.out.println("================ TESTE VENDEDOR ================");
        Vendedor v = new Vendedor("Roberto", "rua 2 ap 2", "666667777",
                1234 , 1000, 0.1, 5000, 0.5);

        System.out.printf("""
                nome: %s
                endereco: %s
                telefone: %s
                codigoSetor: %d
                salarioBase: %.2f
                imposto: %.2f
                valorVendas: %.2f
                comissao: %.2f
                salario: %.2f
                """, v.getNome(), v.getEndereco(), v.getTelefone(), v.getCodigoSetor(),
                v.getSalarioBase(), v.getImposto(), v.getValorVendas(), v.getComissao(), v.calcularSalario());
    }
}
