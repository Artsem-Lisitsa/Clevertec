package clev.project.models;


import clev.project.builder.Builder;

public class CheckBuilder implements Builder {

    private Integer amount;
    private String name;
    private Double cost;
    private Double total;
    @Override
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(Double cost) {
        this.cost = cost;
    }

    @Override
    public void setTotalCost(Double total) {
        this.total = total;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public Double getTotal() {
        return total;
    }

}
