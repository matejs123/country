import { Industry } from './industry.data';
import { Service } from './service.data';
import { Tourism } from './tourism.data';

export interface Economy {
  id: number;
  industries: Industry[];
  services: Service[];
  tourism: Tourism;
}
