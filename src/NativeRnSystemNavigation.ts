import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  hideSystemNavigation(): boolean;
  showSystemNavigation(): boolean;
}

export default TurboModuleRegistry.getEnforcing<Spec>('RnSystemNavigation');
