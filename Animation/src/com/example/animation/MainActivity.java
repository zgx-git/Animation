package com.example.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private ImageView iv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv = (ImageView) findViewById(R.id.iv);
	}

	public void click1(View v) {
//		AlphaAnimation animation = new AlphaAnimation(1.0f, 0.0f);
//		animation.setDuration(2000);
//		animation.setRepeatCount(1);
//		animation.setRepeatMode(Animation.REVERSE);
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_animation);

		iv.startAnimation(animation);

	}

	// 点击按钮 实现iv 执行一个旋转 动画
	public void click2(View v) {
		// fromDegrees 开始角度 toDegrees 结束角度
//			RotateAnimation  ra = new RotateAnimation(0, 360);	
//		RotateAnimation ra = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
//				0.5f);
//		ra.setDuration(2000); // 设置动画执行的时间
//		ra.setRepeatCount(1); // 设置重复的次数
//		ra.setRepeatMode(Animation.REVERSE);// 设置动画执行的模式
		// iv开始执行动画
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.roatate_animation);
		iv.startAnimation(animation);

	}

	// 点击按钮进行一个缩放动画
	public void click3(View v) {
//		ScaleAnimation sa = new ScaleAnimation(1.0f, 2.0f, 1.0f, 2.0f, Animation.RELATIVE_TO_SELF, 0.5f,
//				Animation.RELATIVE_TO_SELF, 0.5f);
//		sa.setDuration(2000); // 设置动画执行的时间
//		sa.setRepeatCount(1); // 设置重复的次数
//		sa.setRepeatMode(Animation.REVERSE);// 设置动画执行的模式
//		// iv开始执行动画
//		iv.startAnimation(sa);
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
		iv.startAnimation(animation);
	}

	// 位移动画
	public void click4(View v) {
//		TranslateAnimation ta = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0,
//				Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0.2f);
//		ta.setDuration(2000); // 设置动画执行的时间
//		ta.setFillAfter(true);// 当动画结束后 动画停留在结束位置
//
//		// 开始动画
//		iv.startAnimation(ta);
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_animation);
		iv.startAnimation(animation);
	}

	// 动画一起飞
	public void click5(View v) {
//		AnimationSet set = new AnimationSet(false);
//
//		// 透明动画
//		AlphaAnimation aa = new AlphaAnimation(1.0f, 0.0f);
//		aa.setDuration(2000); // 设置动画执行的时间
//		aa.setRepeatCount(1); // 设置重复的次数
//		aa.setRepeatMode(Animation.REVERSE);// 设置动画执行的模式
//		// 旋转动画
//		RotateAnimation ra = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
//				0.5f);
//		ra.setDuration(2000); // 设置动画执行的时间
//		ra.setRepeatCount(1); // 设置重复的次数
//		ra.setRepeatMode(Animation.REVERSE);// 设置动画执行的模式
//		// 缩放
//		ScaleAnimation sa = new ScaleAnimation(1.0f, 2.0f, 1.0f, 2.0f, Animation.RELATIVE_TO_SELF, 0.5f,
//				Animation.RELATIVE_TO_SELF, 0.5f);
//		sa.setDuration(2000); // 设置动画执行的时间
//		sa.setRepeatCount(1); // 设置重复的次数
//		sa.setRepeatMode(Animation.REVERSE);// 设置动画执行的模式
//
//		TranslateAnimation ta = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0,
//				Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0.2f);
//		ta.setDuration(2000); // 设置动画执行的时间
//		ta.setFillAfter(true);// 当动画结束后 动画停留在结束位置
//
//		// 添加动画
//		set.addAnimation(aa);
//		set.addAnimation(ra);
//		set.addAnimation(sa);
//		set.addAnimation(ta);
//
//		// 最后一步 要记得 执行动画
//		iv.startAnimation(set);

		Animation animation = AnimationUtils.loadAnimation(this, R.anim.set_animation);
		iv.startAnimation(animation);

	}
}
