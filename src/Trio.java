public class Trio implements MenuItem
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio (Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    @Override
    public String getName() {
        return this.sandwich.getName() + "/" + this.salad.getName() + "/" + this.drink.getName();
    }

    @Override
    public double getPrice()
    {
       double lowest = 0;
        if (this.sandwich.getPrice() <= this.salad.getPrice())
        {
            lowest = this.sandwich.getPrice();
        }
            if (lowest >= this.drink.getPrice())
            {
                lowest = this.drink.getPrice();
            }

        return this.sandwich.getPrice() + this.salad.getPrice() + this.drink.getPrice() - lowest;
    }
}
