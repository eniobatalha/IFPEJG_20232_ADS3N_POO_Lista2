package problemaB;

public class Teste {
    public static void main(String[] args) {
        Porta portaAzul = new Porta(1.80, "azul");
        Garagem garagemCoberta = new Garagem(2, true, null);
        Proprietario proprietarioCasaA = new Proprietario("Carlos Alberto", "3445-3040");
        Endereco enderecoCasaA = new Endereco("Rua Caramuru", 32, "Ouro Preto", "Paulista");
        Casa casaA = new Casa(50.25,enderecoCasaA, "branco gelo", portaAzul, garagemCoberta, false, proprietarioCasaA);
        Endereco enderecoCasaB = new Endereco("Rua Caramuru", 49, "Ouro Preto", "Paulista");
        Casa casaB = new Casa(75.32,enderecoCasaB, "azul piscina", null, garagemCoberta, true, null);
        casaA.setCor("verde");
        casaB.setTemMuro(true);
        Proprietario proprietarioCasaB = new Proprietario("Ana Raquel", "3543-3434");
        casaB.setProprietario(proprietarioCasaB);

        if (casaA.getProprietario() != null && casaB.getProprietario() != null) {
            boolean proprietariosIguais = casaA.getProprietario().getNome().equals(casaB.getProprietario().getNome())
                    && casaA.getProprietario().getTelefone().equals(casaB.getProprietario().getTelefone());

            if (proprietariosIguais) {
                System.out.println("O proprietário da Casa A é igual ao proprietário da Casa B.");
            } else {
                System.out.println("O proprietário da Casa A não é igual ao proprietário da Casa B.");
            }
        } else {
            System.out.println("Alguma das casas não tem proprietário definido.");
        }
    }
}

