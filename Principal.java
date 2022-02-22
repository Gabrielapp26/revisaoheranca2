public class Principal {
    public static void main(String[] args){
        Novo n = new Novo();

        n.setEndereco("Rua dos Limões 226");
        n.setPreco(500000);
        n.setPrecoAdiconal(50000);
        n.setTotalNovo(n.getPreco()+n.getPrecoAdiconal());

        System.out.println("Imóvel Novo");
        System.out.println("Endereço do Imóvel: "+n.getEndereco());
        System.out.println("Preço do Imóvel: R$"+n.getPreco());
        System.out.println("Preço Adicional: R$"+n.getPrecoAdiconal());
        System.out.println("Preço total do Imóvel: "+n.getTotalNovo());
        System.out.println("");

        Velho v = new Velho();

        v.setEndereco("Rua dos Melões 590");
        v.setPreco(500000);
        v.setDesconto(50000);
        v.setTotalVelho(v.getPreco()-v.getDesconto());

        System.out.println("Imóvel Velho");
        System.out.println("Endereço do Imóvel: "+v.getEndereco());
        System.out.println("Preço do Imóvel: R$"+v.getPreco());
        System.out.println("Desconto: R$"+v.getDesconto());
        System.out.println("Preço total do Imóvel: "+v.getTotalVelho());
        System.out.println("");

    } 
}
