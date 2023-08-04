import android.content.Context;
import android.widget.Toast;

public class AiProject {
    public static void displayData(Context context, String name, int amount) {
        String displayText = "Name: " + name + "\nAmount: $" + amount;
        Toast.makeText(context, displayText, Toast.LENGTH_LONG).show();
    }
}
