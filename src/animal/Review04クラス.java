package animal;

public class Review04クラス {

	public static void main(String[] args) {

	Human tanaka=new Human("田中太郎",25,"電車");
	Human suzuki = new Human("鈴木次郎",30,"野球");
	Human sato =new Human("佐藤花子",20,"映画");


    tanaka.say();
    tanaka.think();
    suzuki.say();
    suzuki.think();
    sato.say();
    sato.think();
	}
}
