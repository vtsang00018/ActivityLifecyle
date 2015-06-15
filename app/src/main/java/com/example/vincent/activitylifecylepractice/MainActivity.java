package com.example.vincent.activitylifecylepractice;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Most apps don't need to use onDestroy()
     * Uses: if your activity includes background threads that you created on onCreate(), or long
     *       resources that leak memory if not properly closed
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /* Activity is partially visible, but often indicates that the user is leaving the activity and
     * will soon enter the onStopped() state
     * Uses: stop animations, commit unsaved changes (draft email), release system resources such as
     *       broadcast receivers, handles to sensors, other resources that may consume battery life
     * DONT: USE TO STORE USER CHANGES (such as personal information entered into a form) to
     *       permanent storage because it will slow the app down
     * Example: release camera
     */
    @Override
    protected void onPause() {
        super.onPause();
    }

    /* Activity is in the foreground, including when it's created for the first time
     * Uses: initialize the components you released on onPause(), animations, etc
     * Example: initialize camera
     */
    @Override
    protected void onResume() {
        super.onResume();
    }

    /* onStop and onRestart
     * Key Scenarios:
     *       1) User leaves by clicking the recent button, then returns from launcher or recents
     *       2) User performs action that starts new activity, then clicks back to restart activity
     *       3) User receives a phone call while on your app
     */

    /* No longer visible and should release all resources that aren't needed when user is not using
     * it
     * Uses: Release resources that may leak memory, write information to the database
     */
    @Override
    protected void onStop() {
        super.onStop();
    }

    /* Executed when activity comes back to foreground from onStop(), onStart() is called after
     */
    @Override
    protected void onRestart() {
        super.onRestart();
    }
    /* Executed after onResume()
     * Uses: verify that the required system features are enables (may have been removed from
     *       onStop() or onPause())
     * Example: restart the GPS Service
     */
    @Override
    protected void onStart() {
        super.onStart();
    }

    /* Saving your Activity State
     * onSavedInstanceState() is called before onDestroy to save the activity state
     * onRestoreInstanceState() is called before Resume to restore the activity state
     */

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        /* Save the user's hypothetical game state
        savedInstanceState.putInt(STATE_SCORE, mCurrentScore);
        savedInstanceState.putInt(STATE_LEVEL, mCurrentLevel);
         */

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

       /* Restore the user's hypothetical game state
        mCurrentScore = savedInstanceState.getInt(STATE_SCORE);
        mCurrentLevel = savedInstanceState.getInt(STATE_LEVEL);
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
