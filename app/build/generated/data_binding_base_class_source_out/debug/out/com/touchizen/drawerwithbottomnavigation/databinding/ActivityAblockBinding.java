// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
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

public final class ActivityAblockBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CircleImageView ablockBikeImage;

  @NonNull
  public final CircleImageView ablockCarImage;

  @NonNull
  public final CardView b1Parking;

  @NonNull
  public final CardView b2Parking;

  @NonNull
  public final CardView b3Parking;

  @NonNull
  public final CardView b4Parking;

  @NonNull
  public final CardView b5Parking;

  @NonNull
  public final CardView b6Parking;

  @NonNull
  public final CardView b7Parking;

  @NonNull
  public final CardView bikeParkingAblock;

  @NonNull
  public final CardView c1Parking;

  @NonNull
  public final CardView c2Parking;

  @NonNull
  public final CardView c3Parking;

  @NonNull
  public final CardView c4Parking;

  @NonNull
  public final CardView c5Parking;

  @NonNull
  public final CardView c6Parking;

  @NonNull
  public final CardView c7Parking;

  @NonNull
  public final CardView carParkingAblock;

  @NonNull
  public final AppBarLayout layoutmainAblock;

  @NonNull
  public final GridLayout parkingGridBike;

  @NonNull
  public final GridLayout parkingGridCar;

  @NonNull
  public final Toolbar toolbarSearchAblock;

  private ActivityAblockBinding(@NonNull RelativeLayout rootView,
      @NonNull CircleImageView ablockBikeImage, @NonNull CircleImageView ablockCarImage,
      @NonNull CardView b1Parking, @NonNull CardView b2Parking, @NonNull CardView b3Parking,
      @NonNull CardView b4Parking, @NonNull CardView b5Parking, @NonNull CardView b6Parking,
      @NonNull CardView b7Parking, @NonNull CardView bikeParkingAblock, @NonNull CardView c1Parking,
      @NonNull CardView c2Parking, @NonNull CardView c3Parking, @NonNull CardView c4Parking,
      @NonNull CardView c5Parking, @NonNull CardView c6Parking, @NonNull CardView c7Parking,
      @NonNull CardView carParkingAblock, @NonNull AppBarLayout layoutmainAblock,
      @NonNull GridLayout parkingGridBike, @NonNull GridLayout parkingGridCar,
      @NonNull Toolbar toolbarSearchAblock) {
    this.rootView = rootView;
    this.ablockBikeImage = ablockBikeImage;
    this.ablockCarImage = ablockCarImage;
    this.b1Parking = b1Parking;
    this.b2Parking = b2Parking;
    this.b3Parking = b3Parking;
    this.b4Parking = b4Parking;
    this.b5Parking = b5Parking;
    this.b6Parking = b6Parking;
    this.b7Parking = b7Parking;
    this.bikeParkingAblock = bikeParkingAblock;
    this.c1Parking = c1Parking;
    this.c2Parking = c2Parking;
    this.c3Parking = c3Parking;
    this.c4Parking = c4Parking;
    this.c5Parking = c5Parking;
    this.c6Parking = c6Parking;
    this.c7Parking = c7Parking;
    this.carParkingAblock = carParkingAblock;
    this.layoutmainAblock = layoutmainAblock;
    this.parkingGridBike = parkingGridBike;
    this.parkingGridCar = parkingGridCar;
    this.toolbarSearchAblock = toolbarSearchAblock;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAblockBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAblockBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ablock, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAblockBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ablock_bike_image;
      CircleImageView ablockBikeImage = rootView.findViewById(id);
      if (ablockBikeImage == null) {
        break missingId;
      }

      id = R.id.ablock_car_image;
      CircleImageView ablockCarImage = rootView.findViewById(id);
      if (ablockCarImage == null) {
        break missingId;
      }

      id = R.id.b1_parking;
      CardView b1Parking = rootView.findViewById(id);
      if (b1Parking == null) {
        break missingId;
      }

      id = R.id.b2_parking;
      CardView b2Parking = rootView.findViewById(id);
      if (b2Parking == null) {
        break missingId;
      }

      id = R.id.b3_parking;
      CardView b3Parking = rootView.findViewById(id);
      if (b3Parking == null) {
        break missingId;
      }

      id = R.id.b4_parking;
      CardView b4Parking = rootView.findViewById(id);
      if (b4Parking == null) {
        break missingId;
      }

      id = R.id.b5_parking;
      CardView b5Parking = rootView.findViewById(id);
      if (b5Parking == null) {
        break missingId;
      }

      id = R.id.b6_parking;
      CardView b6Parking = rootView.findViewById(id);
      if (b6Parking == null) {
        break missingId;
      }

      id = R.id.b7_parking;
      CardView b7Parking = rootView.findViewById(id);
      if (b7Parking == null) {
        break missingId;
      }

      id = R.id.bike_parking_ablock;
      CardView bikeParkingAblock = rootView.findViewById(id);
      if (bikeParkingAblock == null) {
        break missingId;
      }

      id = R.id.c1_parking;
      CardView c1Parking = rootView.findViewById(id);
      if (c1Parking == null) {
        break missingId;
      }

      id = R.id.c2_parking;
      CardView c2Parking = rootView.findViewById(id);
      if (c2Parking == null) {
        break missingId;
      }

      id = R.id.c3_parking;
      CardView c3Parking = rootView.findViewById(id);
      if (c3Parking == null) {
        break missingId;
      }

      id = R.id.c4_parking;
      CardView c4Parking = rootView.findViewById(id);
      if (c4Parking == null) {
        break missingId;
      }

      id = R.id.c5_parking;
      CardView c5Parking = rootView.findViewById(id);
      if (c5Parking == null) {
        break missingId;
      }

      id = R.id.c6_parking;
      CardView c6Parking = rootView.findViewById(id);
      if (c6Parking == null) {
        break missingId;
      }

      id = R.id.c7_parking;
      CardView c7Parking = rootView.findViewById(id);
      if (c7Parking == null) {
        break missingId;
      }

      id = R.id.car_parking_ablock;
      CardView carParkingAblock = rootView.findViewById(id);
      if (carParkingAblock == null) {
        break missingId;
      }

      id = R.id.layoutmain_ablock;
      AppBarLayout layoutmainAblock = rootView.findViewById(id);
      if (layoutmainAblock == null) {
        break missingId;
      }

      id = R.id.parking_grid_bike;
      GridLayout parkingGridBike = rootView.findViewById(id);
      if (parkingGridBike == null) {
        break missingId;
      }

      id = R.id.parking_grid_car;
      GridLayout parkingGridCar = rootView.findViewById(id);
      if (parkingGridCar == null) {
        break missingId;
      }

      id = R.id.toolbar_search_ablock;
      Toolbar toolbarSearchAblock = rootView.findViewById(id);
      if (toolbarSearchAblock == null) {
        break missingId;
      }

      return new ActivityAblockBinding((RelativeLayout) rootView, ablockBikeImage, ablockCarImage,
          b1Parking, b2Parking, b3Parking, b4Parking, b5Parking, b6Parking, b7Parking,
          bikeParkingAblock, c1Parking, c2Parking, c3Parking, c4Parking, c5Parking, c6Parking,
          c7Parking, carParkingAblock, layoutmainAblock, parkingGridBike, parkingGridCar,
          toolbarSearchAblock);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
