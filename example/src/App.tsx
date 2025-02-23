import { Text, View, StyleSheet, Pressable } from 'react-native';
import {
  hideSystemNavigation,
  showSystemNavigation,
} from 'rn-system-navigation';

export default function App() {
  const btnHidePress = () => {
    hideSystemNavigation();
  };
  const btnShowPress = () => {
    showSystemNavigation();
  };
  return (
    <View style={styles.container}>
      <Pressable onPress={btnHidePress}>
        <Text>Hide Navigation</Text>
      </Pressable>
      <Pressable onPress={btnShowPress}>
        <Text>Show Navigation</Text>
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    gap: 14,
  },
});
