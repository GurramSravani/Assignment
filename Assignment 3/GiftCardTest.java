public class GiftCardTest
{
	public static void main(String args[])
	{
		GiftCard obj1 = new GiftCard(1000000000,0,true);
		obj1.rechargeCard(3000);
		obj1.swipeCard(500);
		obj1.swipeCard(300);
		System.out.println("Card no :"+obj1.getCardNo()+"\n"+"Balance = "+obj1.getBalance());
		GiftCard obj2 = new GiftCard();
		obj2.rechargeCard(7000);
		obj2.swipeCard(4500);
		obj2.swipeCard(3000);
		System.out.println("Card no :"+obj2.getCardNo()+"\n"+"Balance = "+obj2.getBalance());
	}
}