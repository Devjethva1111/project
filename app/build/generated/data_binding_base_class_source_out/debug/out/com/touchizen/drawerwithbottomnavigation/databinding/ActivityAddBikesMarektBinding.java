// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.touchizen.drawerwithbottomnavigation.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddBikesMarektBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CircleImageView bike;

  @NonNull
  public final CircleImageView bikeAccessories;

  @NonNull
  public final CardView bikeAccessoriesMainCard;

  @NonNull
  public final CircleImageView bikeForRent;

  @NonNull
  public final CardView bikeMainCard;

  @NonNull
  public final CircleImageView callIntentBench;

  @NonNull
  public final CircleImageView callIntentBench2;

  @NonNull
  public final CircleImageView callIntentBench3;

  @NonNull
  public final CardView forRentMainCard;

  @NonNull
  public final AppBarLayout layoutmain;

  @NonNull
  public final Toolbar toolbarSearch;

  private ActivityAddBikesMarektBinding(@NonNull RelativeLayout rootView,
      @NonNull CircleImageView bike, @NonNull CircleImageView bikeAccessories,
      @NonNull CardView bikeAccessoriesMainCard, @NonNull CircleImageView bikeForRent,
      @NonNull CardView bikeMainCard, @NonNull CircleImageView callIntentBench,
      @NonNull CircleImageView callIntentBench2, @NonNull CircleImageView callIntentBench3,
      @NonNull CardView forRentMainCard, @NonNull AppBarLayout layoutmain,
      @NonNull Toolbar toolbarSearch) {
    this.rootView = rootView;
    this.bike = bike;
    this.bikeAccessories = bikeAccessories;
    this.bikeAccessoriesMainCard = bikeAccessoriesMainCard;
    this.bikeForRent = bikeForRent;
    this.bikeMainCard = bikeMainCard;
    this.callIntentBench = callIntentBench;
    this.callIntentBench2 = callIntentBench2;
    this.callIntentBench3 = callIntentBench3;
    this.forRentMainCard = forRentMainCard;
    this.layoutmain = layoutmain;
    this.toolbarSearch = toolbarSearch;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddBikesMarektBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddBikesMarektBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_bikes_marekt, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddBikesMarektBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bike;
      CircleImageView bike = rootView.findViewById(id);
      if (bike == null) {
        break missingId;
      }

      id = R.id.bike_accessories;
      CircleImageView bikeAccessories = rootView.findViewById(id);
      if (bikeAccessories == null) {
        break missingId;
      }

      id = R.id.bike_accessories_main_card;
      CardView bikeAccessoriesMainCard = rootView.findViewById(id);
      if (bikeAccessoriesMainCard == null) {
        break missingId;
      }

      id = R.id.bike_for_rent;
      CircleImageView bikeForRent = rootView.findViewById(id);
      if (bikeForRent == null) {
        break missingId;
      }

      id = R.id.bike_main_card;
      CardView bikeMainCard = rootView.findViewById(id);
      if (bikeMainCard == null) {
        break missingId;
      }

      id = R.id.call_intent_bench;
      CircleImageView callIntentBench = rootView.findViewById(id);
      if (callIntentBench == null) {
        break missingId;
      }

      id = R.id.call_intent_bench2;
      CircleImageView callIntentBench2 = rootView.findViewById(id);
      if (callIntentBench2 == null) {
        break missingId;
      }

      id = R.id.call_intent_bench3;
      CircleImageView callIntentBench3 = rootView.findViewById(id);
      if (callIntentBench3 == null) {
        break missingId;
      }

      id = R.id.for_rent_main_card;
      CardView forRentMainCard = rootView.findViewById(id);
      if (forRentMainCard == null) {
        break missingId;
      }

      id = R.id.layoutmain;
      AppBarLayout layoutmain = rootView.findViewById(id);
      if (layoutmain == null) {
        break missingId;
      }

      id = R.id.toolbar_search;
      Toolbar toolbarSearch = rootView.findViewById(id);
      if (toolbarSearch == null) {
        break missingId;
      }

      return new ActivityAddBikesMarektBinding((RelativeLayout) rootView, bike, bikeAccessories,
          bikeAccessoriesMainCard, bikeForRent, bikeMainCard, callIntentBench, callIntentBench2,
          callIntentBench3, forRentMainCard, layoutmain, toolbarSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
