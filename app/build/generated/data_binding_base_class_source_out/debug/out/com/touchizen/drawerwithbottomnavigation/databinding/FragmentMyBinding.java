// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.touchizen.drawerwithbottomnavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMyBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final FloatingActionButton fab1;

  @NonNull
  public final FloatingActionButton fab2;

  @NonNull
  public final FloatingActionButton fab3;

  @NonNull
  public final View fabBGLayout;

  @NonNull
  public final LinearLayout fabLayout1;

  @NonNull
  public final LinearLayout fabLayout2;

  @NonNull
  public final LinearLayout fabLayout3;

  private FragmentMyBinding(@NonNull FrameLayout rootView, @NonNull FloatingActionButton fab,
      @NonNull FloatingActionButton fab1, @NonNull FloatingActionButton fab2,
      @NonNull FloatingActionButton fab3, @NonNull View fabBGLayout,
      @NonNull LinearLayout fabLayout1, @NonNull LinearLayout fabLayout2,
      @NonNull LinearLayout fabLayout3) {
    this.rootView = rootView;
    this.fab = fab;
    this.fab1 = fab1;
    this.fab2 = fab2;
    this.fab3 = fab3;
    this.fabBGLayout = fabBGLayout;
    this.fabLayout1 = fabLayout1;
    this.fabLayout2 = fabLayout2;
    this.fabLayout3 = fabLayout3;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab;
      FloatingActionButton fab = rootView.findViewById(id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.fab1;
      FloatingActionButton fab1 = rootView.findViewById(id);
      if (fab1 == null) {
        break missingId;
      }

      id = R.id.fab2;
      FloatingActionButton fab2 = rootView.findViewById(id);
      if (fab2 == null) {
        break missingId;
      }

      id = R.id.fab3;
      FloatingActionButton fab3 = rootView.findViewById(id);
      if (fab3 == null) {
        break missingId;
      }

      id = R.id.fabBGLayout;
      View fabBGLayout = rootView.findViewById(id);
      if (fabBGLayout == null) {
        break missingId;
      }

      id = R.id.fabLayout1;
      LinearLayout fabLayout1 = rootView.findViewById(id);
      if (fabLayout1 == null) {
        break missingId;
      }

      id = R.id.fabLayout2;
      LinearLayout fabLayout2 = rootView.findViewById(id);
      if (fabLayout2 == null) {
        break missingId;
      }

      id = R.id.fabLayout3;
      LinearLayout fabLayout3 = rootView.findViewById(id);
      if (fabLayout3 == null) {
        break missingId;
      }

      return new FragmentMyBinding((FrameLayout) rootView, fab, fab1, fab2, fab3, fabBGLayout,
          fabLayout1, fabLayout2, fabLayout3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
