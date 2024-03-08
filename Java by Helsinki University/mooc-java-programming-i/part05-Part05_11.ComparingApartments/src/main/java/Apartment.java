
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }
  
    public int getPricePerSquare() {
        return pricePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs((this.pricePerSquare * this.squares) - (compared.getPricePerSquare() * compared.getSquares()));
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.pricePerSquare * this.squares) > (compared.getPricePerSquare() * compared.getSquares());
    }
}
