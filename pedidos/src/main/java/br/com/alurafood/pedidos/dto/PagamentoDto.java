package br.com.alurafood.pedidos.dto;

import br.com.alurafood.pedidos.enums.StatusPagamento;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PagamentoDto {
    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private StatusPagamento status;
    private Long pedidoId;
    private Long formaDePagamentoId;

    @Override
    public String toString() {
        return "PagamentoDto{" +
                "id=" + id +
                ", valor=" + valor +
                ", nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", expiracao='" + expiracao + '\'' +
                ", codigo='" + codigo + '\'' +
                ", status=" + status +
                ", pedidoId=" + pedidoId +
                ", formaDePagamentoId=" + formaDePagamentoId +
                '}';
    }
}
