public class SwitchPatternMatchingWithEnum {
	public static void main(String[] args) {
		Suit card = Suit.CLUBS;
		EnumDemo(card);
	}
	static void EnumDemo(CardClassification card) {
		 switch(card) {
                        case Suit.CLUBS -> System.out.println("Clubs");
                        case Suit.DIAMOND -> System.out.println("Diamond");
                        case Suit.HEART -> System.out.println("Heart");
                        case Suit.SPADES -> System.out.println("Spades");
                        case Tarot t -> System.out.println("Tarot");
                        default -> System.out.println("No Match");
                }
	}
}
sealed interface CardClassification permits Suit, Tarot {}
enum Suit implements CardClassification {CLUBS, DIAMOND, HEART, SPADES}
final class Tarot implements CardClassification {}
	
