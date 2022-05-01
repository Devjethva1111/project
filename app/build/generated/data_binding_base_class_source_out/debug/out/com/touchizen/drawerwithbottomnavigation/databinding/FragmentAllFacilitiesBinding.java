// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.touchizen.drawerwithbottomnavigation.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAllFacilitiesBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final CircleImageView auditariumImage;

  @NonNull
  public final CircleImageView commonPlotImage;

  @NonNull
  public final CircleImageView gameZoneImage;

  @NonNull
  public final CircleImageView gardenImage;

  @NonNull
  public final CircleImageView gymFacility;

  @NonNull
  public final CircleImageView libraryImage;

  @NonNull
  public final CircleImageView tennis1Image;

  @NonNull
  public final CircleImageView theaterFacility;

  private FragmentAllFacilitiesBinding(@NonNull FrameLayout rootView,
      @NonNull CircleImageView auditariumImage, @NonNull CircleImageView commonPlotImage,
      @NonNull CircleImageView gameZoneImage, @NonNull CircleImageView gardenImage,
      @NonNull CircleImageView gymFacility, @NonNull CircleImageView libraryImage,
      @NonNull CircleImageView tennis1Image, @NonNull CircleImageView theaterFacility) {
    this.rootView = rootView;
    this.auditariumImage = auditariumImage;
    this.commonPlotImage = commonPlotImage;
    this.gameZoneImage = gameZoneImage;
    this.gardenImage = gardenImage;
    this.gymFacility = gymFacility;
    this.libraryImage = libraryImage;
    this.tennis1Image = tennis1Image;
    this.theaterFacility = theaterFacility;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAllFacilitiesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAllFacilitiesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_all_facilities, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAllFacilitiesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.auditarium_image;
      CircleImageView auditariumImage = rootView.findViewById(id);
      if (auditariumImage == null) {
        break missingId;
      }

      id = R.id.common_plot_image;
      CircleImageView commonPlotImage = rootView.findViewById(id);
      if (commonPlotImage == null) {
        break missingId;
      }

      id = R.id.game_zone_image;
      CircleImageView gameZoneImage = rootView.findViewById(id);
      if (gameZoneImage == null) {
        break missingId;
      }

      id = R.id.garden_image;
      CircleImageView gardenImage = rootView.findViewById(id);
      if (gardenImage == null) {
        break missingId;
      }

      id = R.id.gym_facility;
      CircleImageView gymFacility = rootView.findViewById(id);
      if (gymFacility == null) {
        break missingId;
      }

      id = R.id.library_image;
      CircleImageView libraryImage = rootView.findViewById(id);
      if (libraryImage == null) {
        break missingId;
      }

      id = R.id.tennis1_image;
      CircleImageView tennis1Image = rootView.findViewById(id);
      if (tennis1Image == null) {
        break missingId;
      }

      id = R.id.theater_facility;
      CircleImageView theaterFacility = rootView.findViewById(id);
      if (theaterFacility == null) {
        break missingId;
      }

      return new FragmentAllFacilitiesBinding((FrameLayout) rootView, auditariumImage,
          commonPlotImage, gameZoneImage, gardenImage, gymFacility, libraryImage, tennis1Image,
          theaterFacility);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
