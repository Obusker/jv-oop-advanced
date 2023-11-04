package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: RightTriagle, area: "
                + getArea()
                + " sq. units, first leg: "
                + firstLeg
                + " units, second leg: "
                + secondLeg
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    public RightTriangle prepareTriangle() {
        RightTriangle prepareTriangle = new RightTriangle();
        prepareTriangle.setFirstLeg(side());
        prepareTriangle.setSecondLeg(side());
        prepareTriangle.setColor(color());
        return prepareTriangle;
    }
}
