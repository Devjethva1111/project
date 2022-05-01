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

public final class ActivityAddMobileMarketBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CircleImageView callIntentBench;

  @NonNull
  public final CircleImageView callIntentBench2;

  @NonNull
  public final CircleImageView callIntentBench3;

  @NonNull
  public final AppBarLayout layoutmain;

  @NonNull
  public final CardView phoneMainCard;

  @NonNull
  public final CircleImageView phonewale;

  @NonNull
  public final CircleImageView pojara;

  @NonNull
  public final CardView pojaraMainCard;

  @NonNull
  public final Toolbar toolbarSearch;

  @NonNull
  public final CircleImageView vijaySales;

  @NonNull
  public final CardView vijaySalesMainCard;

  private ActivityAddMobileMarketBinding(@NonNull RelativeLayout rootView,
      @NonNull CircleImageView callIntentBench, @NonNull CircleImageView callIntentBench2,
      @NonNull CircleImageView callIntentBench3, @NonNull AppBarLayout layoutmain,
      @NonNull CardView phoneMainCard, @NonNull CircleImageView phonewale,
      @NonNull CircleImageView pojara, @NonNull CardView pojaraMainCard,
      @NonNull Toolbar toolbarSearch, @NonNull CircleImageView vijaySales,
      @NonNull CardView vijaySalesMainCard) {
    this.rootView = rootView;
    this.callIntentBench = callIntentBench;
    this.callIntentBench2 = callIntentBench2;
    this.callIntentBench3 = callIntentBench3;
    this.layoutmain = layoutmain;
    this.phoneMainCard = phoneMainCard;
    this.phonewale = phonewale;
    this.pojara = pojara;
    this.pojaraMainCard = pojaraMainCard;
    this.toolbarSearch = toolbarSearch;
    this.vijaySales = vijaySales;
    this.vijaySalesMainCard = vijaySalesMainCard;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddMobileMarketBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddMobileMarketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_mobile_market, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddMobileMarketBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
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

      id = R.id.layoutmain;
      AppBarLayout layoutmain = rootView.findViewById(id);
      if (layoutmain == null) {
        break missingId;
      }

      id = R.id.phone_main_card;
      CardView phoneMainCard = rootView.findViewById(id);
      if (phoneMainCard == null) {
        break missingId;
      }

      id = R.id.phonewale;
      CircleImageView phonewale = rootView.findViewById(id);
      if (phonewale == null) {
        break missingId;
      }

      id = R.id.pojara;
      CircleImageView pojara = rootView.findViewById(id);
      if (pojara == null) {
        break missingId;
      }

      id = R.id.pojara_main_card;
      CardView pojaraMainCard = rootView.findViewById(id);
      if (pojaraMainCard == null) {
        break missingId;
      }

      id = R.id.toolbar_search;
      Toolbar toolbarSearch = rootView.findViewById(id);
      if (toolbarSearch == null) {
        break missingId;
      }

      id = R.id.vijay_sales;
      CircleImageView vijaySales = rootView.findViewById(id);
      if (vijaySales == null) {
        break missingId;
      }

      id = R.id.vijay_sales_main_card;
      CardView vijaySalesMainCard = rootView.findViewById(id);
      if (vijaySalesMainCard == null) {
        break missingId;
      }

      return new ActivityAddMobileMarketBinding((RelativeLayout) rootView, callIntentBench,
          callIntentBench2, callIntentBench3, layoutmain, phoneMainCard, phonewale, pojara,
          pojaraMainCard, toolbarSearch, vijaySales, vijaySalesMainCard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
