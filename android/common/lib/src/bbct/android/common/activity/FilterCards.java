package bbct.android.common.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import bbct.android.common.R;
import java.util.ArrayList;

public class FilterCards extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.filter_cards);
        this.buttonOk = (Button) this.findViewById(R.id.ok_button);
        this.mainLayout = (LinearLayout) this.findViewById(R.id.mainLayout);

        // restore input fields state
        if (savedInstanceState != null) {
            ArrayList<Integer> enabledFields = savedInstanceState.getIntegerArrayList(this.getString(R.string.input_extra));
            for (int i : enabledFields) {
                EditText et = (EditText) this.findViewById(TEXT_FIELDS[i]);
                et.setEnabled(true);
            }
        }

        // restore "Ok" button state
        if (this.numberChecked() > 0) {
            this.buttonOk.setEnabled(true);
        }
    }

    /**
     * Save the state of all {@link EditText} elements.
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        ArrayList<Integer> enabledFields = new ArrayList<Integer>();
        for (int i = 0; i < TEXT_FIELDS.length; i++) {
            EditText et = (EditText) this.findViewById(TEXT_FIELDS[i]);
            if (et.isEnabled()) {
                enabledFields.add(i);
            }
        }

        outState.putIntegerArrayList(this.getString(R.string.input_extra), enabledFields);
    }

    /**
     * Finds the corresponding {@link EditText} element
     * given a {@link CheckBox} that was clicked upon.
     * @param v - the checkbox that was clicked
     */
    public void onCheckBoxClick(View v) {
        EditText input = null;

        for (int i = 0; i < CHECKBOXES.length; i++) {
            if (v.getId() == CHECKBOXES[i])
                input = (EditText) this.findViewById(TEXT_FIELDS[i]);
        }

        // toggle ok button
        if (this.numberChecked() > 0) {
            this.buttonOk.setEnabled(true);
        } else {
            this.buttonOk.setEnabled(false);
        }

        this.toggleTextField(input);
    }

    /**
     * Toggles the state of {@link EditText}.
     * @param et - the {@link EditText} to toggle
     */
    private void toggleTextField(EditText et) {
        if (et.isEnabled()) {
            et.setEnabled(false);
            this.mainLayout.requestFocus();
        } else {
            et.setEnabled(true);
            et.requestFocus();
        }
    }

    /**
     * Counts the number of {@link CheckBox} elements
     * that are checked.
     * @return the number of checked elements
     */
    private int numberChecked() {
        int count = 0;
        for (int i = 0; i < CHECKBOXES.length; i++) {
            CheckBox cb = (CheckBox) this.findViewById(CHECKBOXES[i]);
            if (cb.isChecked()) {
                count++;
            }
        }

        return count;
    }

    private static final int[] CHECKBOXES = { R.id.brand_check,
        R.id.year_check, R.id.number_check, R.id.player_name_check,
        R.id.team_check };

    private static final int[] TEXT_FIELDS = { R.id.brand_input,
        R.id.year_input, R.id.number_input, R.id.player_name_input,
        R.id.team_input };

    private Button buttonOk;
    private LinearLayout mainLayout;
}