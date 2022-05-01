// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.touchizen.drawerwithbottomnavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Button changeEmail;

  @NonNull
  public final Button changeEmailButton;

  @NonNull
  public final Button changePass;

  @NonNull
  public final Button changePasswordButton;

  @NonNull
  public final EditText newEmail;

  @NonNull
  public final EditText newPassword;

  @NonNull
  public final EditText oldEmail;

  @NonNull
  public final EditText password;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button remove;

  @NonNull
  public final Button removeUserButton;

  @NonNull
  public final Button send;

  @NonNull
  public final Button sendingPassResetButton;

  @NonNull
  public final Button signOut;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMain2Binding(@NonNull CoordinatorLayout rootView, @NonNull Button changeEmail,
      @NonNull Button changeEmailButton, @NonNull Button changePass,
      @NonNull Button changePasswordButton, @NonNull EditText newEmail,
      @NonNull EditText newPassword, @NonNull EditText oldEmail, @NonNull EditText password,
      @NonNull ProgressBar progressBar, @NonNull Button remove, @NonNull Button removeUserButton,
      @NonNull Button send, @NonNull Button sendingPassResetButton, @NonNull Button signOut,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.changeEmail = changeEmail;
    this.changeEmailButton = changeEmailButton;
    this.changePass = changePass;
    this.changePasswordButton = changePasswordButton;
    this.newEmail = newEmail;
    this.newPassword = newPassword;
    this.oldEmail = oldEmail;
    this.password = password;
    this.progressBar = progressBar;
    this.remove = remove;
    this.removeUserButton = removeUserButton;
    this.send = send;
    this.sendingPassResetButton = sendingPassResetButton;
    this.signOut = signOut;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.changeEmail;
      Button changeEmail = rootView.findViewById(id);
      if (changeEmail == null) {
        break missingId;
      }

      id = R.id.change_email_button;
      Button changeEmailButton = rootView.findViewById(id);
      if (changeEmailButton == null) {
        break missingId;
      }

      id = R.id.changePass;
      Button changePass = rootView.findViewById(id);
      if (changePass == null) {
        break missingId;
      }

      id = R.id.change_password_button;
      Button changePasswordButton = rootView.findViewById(id);
      if (changePasswordButton == null) {
        break missingId;
      }

      id = R.id.new_email;
      EditText newEmail = rootView.findViewById(id);
      if (newEmail == null) {
        break missingId;
      }

      id = R.id.newPassword;
      EditText newPassword = rootView.findViewById(id);
      if (newPassword == null) {
        break missingId;
      }

      id = R.id.old_email;
      EditText oldEmail = rootView.findViewById(id);
      if (oldEmail == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.remove;
      Button remove = rootView.findViewById(id);
      if (remove == null) {
        break missingId;
      }

      id = R.id.remove_user_button;
      Button removeUserButton = rootView.findViewById(id);
      if (removeUserButton == null) {
        break missingId;
      }

      id = R.id.send;
      Button send = rootView.findViewById(id);
      if (send == null) {
        break missingId;
      }

      id = R.id.sending_pass_reset_button;
      Button sendingPassResetButton = rootView.findViewById(id);
      if (sendingPassResetButton == null) {
        break missingId;
      }

      id = R.id.sign_out;
      Button signOut = rootView.findViewById(id);
      if (signOut == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMain2Binding((CoordinatorLayout) rootView, changeEmail, changeEmailButton,
          changePass, changePasswordButton, newEmail, newPassword, oldEmail, password, progressBar,
          remove, removeUserButton, send, sendingPassResetButton, signOut, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
