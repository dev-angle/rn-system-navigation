import RnSystemNavigation from './NativeRnSystemNavigation';

export function hideSystemNavigation(): boolean {
  return RnSystemNavigation.hideSystemNavigation();
}

export function showSystemNavigation(): boolean {
  return RnSystemNavigation.showSystemNavigation();
}
