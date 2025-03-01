import { Platform } from 'react-native';
import RnSystemNavigation from './NativeRnSystemNavigation';

const isAndroid = Platform.OS === 'android';

export function hideSystemNavigation(): boolean {
  if (isAndroid) {
    return RnSystemNavigation.hideSystemNavigation();
  }
  return false;
}

export function showSystemNavigation(): boolean {
  if (isAndroid) {
    return RnSystemNavigation.showSystemNavigation();
  }
  return false;
}
