package com.example.design.patterns.pattern.structural.bridge.mode;

import com.example.commons.log.LogUtils;

/**
 * @author clx
 */
public class PayFingerprintServiceImpl implements PayModeService {

	@Override
	public boolean security(String uid) {
		LogUtils.info("pay with fingerprint.");
		return true;
	}
}
