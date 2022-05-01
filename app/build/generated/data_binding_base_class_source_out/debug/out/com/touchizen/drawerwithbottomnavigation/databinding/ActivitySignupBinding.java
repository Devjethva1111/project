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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.touchizen.drawerwithbottomnavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Button btnResetPassword;

  @NonNull
  public final EditText email;

  @NonNull
  public final EditText password;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button signInButton;

  @NonNull
  public final Button signUpButton;

  private ActivitySignupBinding(@NonNull CoordinatorLayout rootView,
      @NonNull Button btnResetPassword, @NonNull EditText email, @NonNull EditText password,
      @NonNull ProgressBar progressBar, @NonNull Button signInButton,
      @NonNull Button signUpButton) {
    this.rootView = rootView;
    this.btnResetPassword = btnResetPassword;
    this.email = email;
    this.password = password;
    this.progressBar = progressBar;
    this.signInButton = signInButton;
    this.signUpButton = signUpButton;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_reset_password;
      Button btnResetPassword = rootView.findViewById(id);
      if (btnResetPassword == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = rootView.findViewById(id);
      if (email == null) {
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

      id = R.id.sign_in_button;
      Button signInButton = rootView.findViewById(id);
      if (signInButton == null) {
        break missingId;
      }

      id = R.id.sign_up_button;
      Button signUpButton = rootView.findViewById(id);
      if (signUpButton == null) {
        break missingId;
      }

      return new ActivitySignupBinding((CoordinatorLayout) rootView, btnResetPassword, email,
          password, progressBar, signInButton, signUpButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
