package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mbuttonButton,mTopbutton;
    TextView mstoryTextView;
    int mStoryIndex = 1;
    boolean mAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mbuttonButton = (Button) findViewById(R.id.buttonBottom);
        mTopbutton =(Button) findViewById(R.id.buttonTop);
        mstoryTextView =(TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1){
                    mstoryTextView.setText(R.string.T2_Story);
                    mbuttonButton.setText(R.string.T2_Ans2);
                    mTopbutton.setText(R.string.T2_Ans1);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2){
                    mstoryTextView.setText(R.string.T4_End);
                    mbuttonButton.setVisibility(View.GONE);
                    mTopbutton.setVisibility(View.GONE);
                } else if (mStoryIndex == 3){
                    mstoryTextView.setText(R.string.T5_End);
                    mbuttonButton.setVisibility(View.GONE);
                    mTopbutton.setVisibility(View.GONE);
                }
            }
        });

        mTopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 2){
                    mstoryTextView.setText(R.string.T3_Story);
                    mbuttonButton.setText(R.string.T3_Ans2);
                    mTopbutton.setText(R.string.T3_Ans1);
                    mStoryIndex = 3;
               } else if (mStoryIndex == 3) {
                    mstoryTextView.setText(R.string.T6_End);
                    mbuttonButton.setVisibility(View.GONE);
                    mTopbutton.setVisibility(View.GONE);
                } else if (mStoryIndex == 1) {
                    mstoryTextView.setText(R.string.T3_Story);
                    mbuttonButton.setText(R.string.T3_Ans2);
                    mTopbutton.setText(R.string.T3_Ans1);
                    mStoryIndex = 3;
                }
            }
        });



    }
}
