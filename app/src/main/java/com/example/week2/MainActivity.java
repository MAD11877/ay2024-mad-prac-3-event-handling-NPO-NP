package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;
import sg.edu.np.mad.madpractical3.R;
import com.example.week2.User;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    User usr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr = new User("MAD","MAD Student",1,false);

        TextView tvName = (TextView)this.findViewById(R.id.tvName);
        tvName.setText(usr.getName());

        Button btnFollow = (Button)this.findViewById(R.id.btnFollow);
        btnFollow.setOnClickListener(new btnFollowHandler());

        Button btnMsg = (Button)this.findViewById(R.id.btnMsg);
        btnMsg.setOnClickListener(new btnMessageHandler());
    }

    class btnFollowHandler implements Button.OnClickListener
    {
        public void onClick(View v) {
            Button btn = (Button) v;
            if (usr.getFollowed()){ // true, so show Follow label, set followed to false
                btn.setText("Follow");
                usr.setFollowed(false);
            } else { // false, so show Unfollow label, set followed to true,
                usr.setFollowed(true);
                btn.setText("Unfollow");
            }
        }
    } // btnFollowHandler

    class btnMessageHandler implements Button.OnClickListener
    {
        public void onClick(View v) {
//            Intent childActivity = new Intent(MainActivity.this, ChildActivity.class);
//            startActivity(childActivity);
        }
    } // btnMessageHandler

}
