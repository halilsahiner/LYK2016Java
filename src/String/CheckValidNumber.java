package String;

public class CheckValidNumber {

	public static void main(String args[]) {

		String[] str = new String[] { "10.20", "1234", "12", "Aİ" };

		for (int i = 0; i < str.length; i++) {

			if (str[i].indexOf(".") > 0) {
				try {

					Double.parseDouble(str[i]);

					System.out.println(str[i] + " geçerli bir ondalıklı sayıdır.");

				} catch (NumberFormatException nme) {

					System.out.println(str[i] + " Geçerli değil");
				}
			} else {
				try {
					Integer.parseInt(str[i]);

					System.out.println(str[i] + " geçerli bir tam sayıdır");

				} catch (NumberFormatException nme) {

					System.out.println(str[i] + " Geçerli değil.");
				}
			}
		}

	}

}
