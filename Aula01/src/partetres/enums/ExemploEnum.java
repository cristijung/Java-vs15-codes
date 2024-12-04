package partetres.enums;

public class ExemploEnum {

    public enum StatusPedido {
        NOVO("Novo pedido recebido"),
        PROCESSANDO("Pedido está sendo processado"),
        ENVIADO("Pedido foi enviado"),
        ENTREGUE("Pedido foi entregue");

        private String descricao;

        StatusPedido(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }

    public static void main(String[] args) {
        StatusPedido statusAtual = StatusPedido.NOVO;
        System.out.println("Status atual: " + statusAtual);
        System.out.println("Descrição: " + statusAtual.getDescricao());

        //mudando de status
        statusAtual = StatusPedido.PROCESSANDO;
        System.out.println("Status atual: " + statusAtual);
        System.out.println("Descrição: " + statusAtual.getDescricao());

        statusAtual = StatusPedido.ENVIADO;
        System.out.println("Status atual: " + statusAtual);
        System.out.println("Descrição: " + statusAtual.getDescricao());

        statusAtual = StatusPedido.ENTREGUE;
        System.out.println("Status atual: " + statusAtual);
        System.out.println("Descrição: " + statusAtual.getDescricao());
    }
}

