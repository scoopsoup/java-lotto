package step4.domain.money;

public interface Money {

    Money minus(Money other);

    Integer amount();

    Money sum(Money cache);


}
